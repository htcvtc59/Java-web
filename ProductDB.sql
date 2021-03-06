USE [master]
GO
/****** Object:  Database [ProductDB]    Script Date: 16/10/2017 9:01:35 CH ******/
CREATE DATABASE [ProductDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ProductDB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\ProductDB.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'ProductDB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\ProductDB_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [ProductDB] SET COMPATIBILITY_LEVEL = 130
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ProductDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ProductDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ProductDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ProductDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ProductDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ProductDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [ProductDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ProductDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ProductDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ProductDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ProductDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ProductDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ProductDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ProductDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ProductDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ProductDB] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ProductDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ProductDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ProductDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ProductDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ProductDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ProductDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ProductDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ProductDB] SET RECOVERY FULL 
GO
ALTER DATABASE [ProductDB] SET  MULTI_USER 
GO
ALTER DATABASE [ProductDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ProductDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ProductDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ProductDB] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [ProductDB] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ProductDB', N'ON'
GO
ALTER DATABASE [ProductDB] SET QUERY_STORE = OFF
GO
USE [ProductDB]
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [ProductDB]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 16/10/2017 9:01:35 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[proId] [int] NOT NULL,
	[prodName] [varchar](200) NULL,
	[prodPrice] [float] NULL,
	[prodQuantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[proId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Product] ([proId], [prodName], [prodPrice], [prodQuantity]) VALUES (1, N'pro1', 12, 1)
INSERT [dbo].[Product] ([proId], [prodName], [prodPrice], [prodQuantity]) VALUES (2, N'pro2', 23, 3)
INSERT [dbo].[Product] ([proId], [prodName], [prodPrice], [prodQuantity]) VALUES (3, N'pro3', 13, 4)
INSERT [dbo].[Product] ([proId], [prodName], [prodPrice], [prodQuantity]) VALUES (1453, N'1', 1, 1)
INSERT [dbo].[Product] ([proId], [prodName], [prodPrice], [prodQuantity]) VALUES (5555, N'55', 55, 55)
USE [master]
GO
ALTER DATABASE [ProductDB] SET  READ_WRITE 
GO
