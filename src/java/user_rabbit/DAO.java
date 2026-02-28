/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_rabbit;

import invoice.invoiceDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;
import wishlist.WishList;

/**
 *
 * @author DELL'
 */
public class DAO extends DBContext {

    public List<userDTO> getAllUser() {
        List<userDTO> list = new ArrayList<>();
        String sql = "select * from tbl_User";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                userDTO u = new userDTO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean checkLogin(String userID, int password) {
        List<userDTO> list = getAllUser();
        boolean check = false;
        for (userDTO i : list) {
            if (i.getUserId().equals(userID) && i.getPassword() == password) {
                check = true;
            }
        }
        return check;
    }

    public int getUserRole(String userID, int password) {
        int role = -1;
        userDTO u = getUser(userID);
        if (u != null) {
            role = u.getRole();
        }
        return role;
    }

    public userDTO getUser(String userId) {
        String sql = "select * from tbl_User where userId=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, userId);
            ResultSet rs = sm.executeQuery();
            if (rs.next()) {
                userDTO u = new userDTO(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean insert(userDTO user) throws ClassNotFoundException, SQLException {
        boolean checkInsert = false;
        String sql = "INSERT INTO tbl_User ([userId], [password], [fullName], [role] ) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, user.getUserId());
            sm.setInt(2, user.getPassword());
            sm.setString(3, user.getFullName());
            sm.setInt(4, user.getRole());

            int rowsAffected = sm.executeUpdate();
            if (rowsAffected > 0) {
                checkInsert = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return checkInsert;
    }

    public List<RabbitDTO> getAllRabbit() {
        List<RabbitDTO> list = new ArrayList<>();
        String sql = "select * from tbl_Rabbit";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                RabbitDTO m = new RabbitDTO(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getBoolean(8));
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<RabbitDTO> searchRabbitIdName(String search) {
        List<RabbitDTO> list = getAllRabbit();
        List<RabbitDTO> list2 = new ArrayList<>();
        for (RabbitDTO i : list) {
            if (i.getRabbitName().toLowerCase().contains(search.toLowerCase()) || i.getRabbitId().toLowerCase().contains(search.toLowerCase())) {
                list2.add(i);
            }
        }
        return list2;
    }

    public List<userDTO> searchUserByFullName(String search) {
        List<userDTO> list = getAllUser();
        List<userDTO> list2 = new ArrayList<>();
        for (userDTO i : list) {
            if (i.getFullName().toLowerCase().contains(search.toLowerCase())) {
                list2.add(i);
            }
        }
        return list2;
    }

    public boolean deleteRabbit(String rabbitId) {
        String sql = "delete from tbl_Rabbit where rabbitId=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, rabbitId);
            sm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public RabbitDTO getRabbitById(String rabbitId) {
        String sql = "select * from tbl_Rabbit where rabbitId=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, rabbitId);
            ResultSet rs = sm.executeQuery();
            if (rs.next()) {
                RabbitDTO m = new RabbitDTO(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getBoolean(8));
                return m;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void addNewRabbit(RabbitDTO m) {
        String sql = "insert into tbl_Rabbit values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, m.getRabbitId());
            sm.setString(2, m.getDescription());
            sm.setFloat(3, m.getPrice());
            sm.setString(4, m.getRabbitName());
            sm.setString(5, m.getImg());
            sm.setInt(6, m.getYearOfProduction());
            sm.setInt(7, m.getQuantity());
            sm.setBoolean(8, m.isNotSale());
            sm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateRabbit(RabbitDTO m) {
        String sql = "Update tbl_Rabbit set price=?,description=?,quantity=?,notSale=? where rabbitId=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setFloat(1, m.getPrice());
            sm.setString(2, m.getDescription());
            sm.setInt(3, m.getQuantity());
            sm.setBoolean(4, m.isNotSale());
            sm.setString(5, m.getRabbitId());
            sm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<RabbitDTO> searchRabbitInRange(float min, float max) {
        List<RabbitDTO> list = getAllRabbit();
        List<RabbitDTO> list2 = new ArrayList<>();
        for (RabbitDTO i : list) {
            if (i.getPrice() >= min && i.getPrice() <= max) {
                list2.add(i);
            }
        }
        return list2;
    }

    public boolean addItem(WishList w) {
        String sql = "insert into tbl_Wishlist values(?,?,?,?,?,?,?)";
        boolean check = false;
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, w.getuId());
            sm.setString(2, w.getpName());
            sm.setFloat(3, w.getpPrice());
            sm.setString(4, w.getDescription());
            sm.setInt(5, w.getYearOfProduction());
            sm.setString(6, w.getImage());
            sm.setString(7, w.getpId());
            check = sm.executeUpdate() > 0 ? true : false;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return check;
    }

    public List<WishList> showWishList(String uId) {
        List<WishList> list = new ArrayList<>();
        String sql = "select * from tbl_Wishlist where uId=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, uId);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                WishList w = new WishList(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7));
                list.add(w);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<WishList> getWishList() {
        List<WishList> list = new ArrayList<>();
        String sql = "select * from tbl_Wishlist";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                WishList w = new WishList(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7));
                list.add(w);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void removeFromWishlist(String uId, String pName) {
        String sql = "delete from tbl_Wishlist where uId=? and pName=?";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, uId);
            sm.setString(2, pName);
            sm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createInvoice(invoiceDTO i) {
        String sql = "insert into tbl_Invoice values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            sm.setString(1, i.getInvId());
            sm.setString(2, i.getUserId());
            sm.setFloat(3, i.getTotal());
            sm.setString(4, i.getDateBuy());

            sm.setString(5, i.getAddress());
            sm.setString(6, i.getPhone());
            sm.setString(7, i.getCity());
            sm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<invoiceDTO> showInvoice() {
        List<invoiceDTO> list = new ArrayList<>();
        String sql = "select * from tbl_Invoice";
        try {
            PreparedStatement sm = connection.prepareStatement(sql);
            ResultSet rs = sm.executeQuery();
            while (rs.next()) {
                invoiceDTO i = new invoiceDTO(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(i);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<RabbitDTO> list = dao.getAllRabbit();
//        List<RabbitDTO> list2 = dao.searchRabbitIdName("");
//        dao.deleteRabbit("W033");
//        RabbitDTO w = dao.getRabbitById("W01");
//        boolean a = dao.checkLogin("hoa", 123);
//        userDTO u = dao.getUser("hoa");
////        List<mobileDTO> l = dao.getAllMobile();
////        List<mobileDTO> list2 = dao.searchMobileIdName("5");
////        mobileDTO m = dao.getMobileById("MB9");
////        mobileDTO m1 = new mobileDTO("msa", "asd", 400, "asd", 200, 2, true);
////        dao.addNewMobile(m1);
//        int numb[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        String word[] = {"B", "A", "E", "S", "U", "Z", "Y"};
//        Random r = new Random();
//        String invoice = word[r.nextInt(word.length)] + word[r.nextInt(word.length)] + word[r.nextInt(word.length)] + "-" + numb[r.nextInt(numb.length)] + numb[r.nextInt(numb.length)] + numb[r.nextInt(numb.length)];;
//        System.out.println(invoice);
//        LocalDateTime TimeCheckOut = LocalDateTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDateTime = TimeCheckOut.format(dtf);
//        invoiceDTO inv = new invoiceDTO(invoice, "cuong", 4000, formattedDateTime, "0838699817", "3/2 to20, khu pho3,bien hoa", "dong nai");
//        dao.createInvoice(inv);
//        RabbitDTO c = dao.getRabbitById("W-test3");
//        List<invoiceDTO> list3 = dao.showInvoice();
//        System.out.println(list3);
//    }
}
