
USE [JellyFish]
GO
/****** Object:  Table [dbo].[tbl_Invoice]    Script Date: 6/16/2024 7:35:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Invoice](
	[invId] [varchar](50) NOT NULL,
	[userId] [varchar](50) NOT NULL,
	[total] [float] NULL,
	[dateBuy] [varchar](500) NULL,
	[phone] [varchar](250) NOT NULL,
	[address] [nvarchar](500) NULL,
	[city] [nvarchar](100) NULL,
 CONSTRAINT [PK_InvoiceUser] PRIMARY KEY CLUSTERED 
(
	[invId] ASC,
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_User]    Script Date: 6/16/2024 7:35:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_User](
	[userId] [varchar](20) NOT NULL,
	[password] [int] NOT NULL,
	[fullName] [varchar](50) NOT NULL,
	[role] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_Watch]    Script Date: 6/16/2024 7:35:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Rabbit](
	[RabbitId] [varchar](30) NOT NULL,
	[description] [varchar](250) NOT NULL,
	[price] [float] NULL,
	[RabbitName] [varchar](20) NOT NULL,
	[image] [varchar](500) NOT NULL,
	[yearOfProduction] [int] NULL,
	[quantity] [int] NULL,
	[notSale] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[RabbitId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbl_Wishlist]    Script Date: 6/16/2024 7:35:35 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbl_Wishlist](
	[uId] [varchar](50) NOT NULL,
	[pName] [varchar](50) NOT NULL,
	[pPrice] [float] NOT NULL,
	[description] [varchar](255) NULL,
	[yearOfProduction] [int] NULL,
	[image] [varchar](500) NULL,
	[pId] [varchar](50) NULL,
 CONSTRAINT [uId_pName] PRIMARY KEY CLUSTERED 
(
	[uId] ASC,
	[pName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[tbl_User] ([userId], [password], [fullName], [role]) VALUES (N'u1', 1, N'Dinh Khoa', 2)
INSERT [dbo].[tbl_User] ([userId], [password], [fullName], [role]) VALUES (N'u2', 1, N'Trung Nguyen', 0)
INSERT [dbo].[tbl_User] ([userId], [password], [fullName], [role]) VALUES (N'u3', 1, N'Kien Quoc', 1)
GO

INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R01', N'Loveably luminous, Alice Axolotl is a whole lot of kooky in hot pink floof! ', 3000, N'Alice Axolotl', N'aliceAxolotl.jpg', 2015, 15, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R02', N'Andie Axolotl is a bold and bubbly scamp who loves to paddle in the river with those big bobbly feet! ', 4350, N'Andie Axolotl', N'andieAxolotl.jpg', 2023, 10, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R03', N'Bashful Beige Bunny is a popular fellow with scrummy-soft Jellycat fur and lovely long flopsy ears mean that with just one cuddle, you’ll never want to let go.', 1500, N'Beige Bunny', N'beigeBunny.jpg', 2019, 20, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R04', N'Amuseables Birthday Cake is snuggly-scrumptious, with tussly fur so beautifully baked.', 2750, N'Cake', N'cake.jpg', 2012, 30, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R05', N'Clyde Capybara is chill and charismatic with a chunky tum, purple-brown snout and chocolate two-tone fur.', 1350, N'Capybara', N'capybara.jpg', 2022, 19, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R06', N'Chrissie Crab is rockpool-ready, with a gorgeously soft tangerine shell.', 5350, N'Chrissie Crab', N'chrissieCrab.jpg', 2023, 22, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R07', N'Bashful Cream Bunny’s gorgeous long ears look like two big dollops of clotted cream. Mmmm!', 4200, N'Cream Bunny', N'creamBunny.jpg', 2020, 32, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R08', N'Gordy Guinea Pig is a little ball of vanilla-fudge softness! ', 3260, N'Gordy Guinea', N'gordyGuinea.jpg', 2018, 25, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R09', N'Hank Hamster is Gordy Guinea Pig pal, and just as divinely podgy.', 5860, N'Hank Hamster', N'hankHamster.jpg', 2023, 37, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R10', N'Bashful Lilac Bunny is very attentive - she tilts her head to hear all the best tales and readies her yummy-soft purply ears.', 6800, N'Lilac Bunny', N'lilacBunny.jpg', 2024, 10, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R11', N'Onyx Dragon is a liquorice lovely with a tubby tum of soft black fur.', 1300, N'Onyx Dragon', N'onyxDragon.jpg', 2020, 14, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R12', N'Adorable, snuggly and very, very cosy, let’s welcome the wonderful Peanut Penguin! ', 8900, N'Peanut Penguin', N'peanutPenguin.jpg', 2021, 33, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R13', N'Ricky Rain-frog likes to sit and puzzle out the world.', 8900, N'Rain Frog', N'rainFrog.jpg', 2021, 33, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R14', N'Amuseables Boiled Egg Groom cant wait to say, I do! ', 8900, N'Egg Groom', N'eggGroom.jpg', 2021, 33, 1)
INSERT [dbo].[tbl_Rabbit] ([RabbitId], [description], [price], [RabbitName], [image], [yearOfProduction], [quantity], [notSale]) VALUES (N'R15', N'Fabulous flapper Rose Dragon is just so sleepy after zooming through the sky!', 8900, N'Rose Dragon', N'roseDragon.jpg', 2021, 33, 1)

GO
