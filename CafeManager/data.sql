CREATE DATABASE QuanLyQuanCaffe
GO

USE QuanLyQuanCaffe
GO

select name from FoodCategory where name like '%xay%'

CREATE TABLE TableFood
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL DEFAULT N'Bàn chưa có tên',
	status int NOT NULL DEFAULT 0	-- 0 Trống || 1 Có người
)
GO

CREATE TABLE Account
(
	UserName NVARCHAR(100) PRIMARY KEY,
	PassWord NVARCHAR(1000) NOT NULL DEFAULT 0,
	FullName nvarchar(100),
	Type INT NOT NULL  DEFAULT 0 -- 1: admin && 0: staff
)
GO

CREATE TABLE FoodCategory
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL DEFAULT N'Chưa đặt tên'
)
GO

CREATE TABLE Food
(
	id INT IDENTITY PRIMARY KEY,
	name NVARCHAR(100) NOT NULL DEFAULT N'Chưa đặt tên',
	idCategory INT NOT NULL,
	price FLOAT NOT NULL DEFAULT 0
	
	FOREIGN KEY (idCategory) REFERENCES dbo.FoodCategory(id)
)
GO

CREATE TABLE Bill
(
	id INT IDENTITY PRIMARY KEY,
	DataCheck DATE NOT NULL DEFAULT GETDATE(),
	TimeCheckIn Time,
	TimeCheckOut TIME,
	idTable INT NOT NULL,
	status INT NOT NULL DEFAULT 0, -- 1: đã thanh toán && 0: chưa thanh toán
	discount INT,
	totalPrice FLOAT,
	userStaff nvarchar(100) not null default 'rwus'
	FOREIGN KEY (idTable) REFERENCES dbo.TableFood(id),
	FOREIGN KEY (userStaff) REFERENCES dbo.account(userName)
)
GO

CREATE TABLE BillInfo
(
	id INT IDENTITY PRIMARY KEY,
	idBill INT NOT NULL,
	idFood INT NOT NULL,
	count INT NOT NULL DEFAULT 0
	
	FOREIGN KEY (idBill) REFERENCES dbo.Bill(id),
	FOREIGN KEY (idFood) REFERENCES dbo.Food(id)
)
GO

INSERT INTO dbo.Account
        ( UserName ,
          PassWord ,
		  FullName ,
          Type
        )
VALUES  ( N'rwus' ,
          N'1' , 
		  N'Nguyen Quoc Cuong',
          1 
        )
INSERT INTO dbo.Account
        ( UserName ,
          PassWord ,
          Type
        )
VALUES  ( N'huongcsm' , 
          N'1' ,
		  N'Nguyen Thi Thanh Huong',
          0  
        )
GO

INSERT INTO dbo.Account
        ( UserName ,
          PassWord ,
          Type
        )
VALUES  ( N'minhhungth98' , 
          N'1' ,
		  N'Tran Minh Hung',
          0 
        )
GO


DECLARE @i INT = 1

WHILE @i <= 21
BEGIN
	INSERT dbo.TableFood ( name)VALUES  ( N'Bàn ' + CAST(@i AS nvarchar(100)))
	SET @i = @i + 1
END
GO
-- thêm category
INSERT dbo.FoodCategory
        ( name )
VALUES  ( N'Cà phê'  
          )
INSERT dbo.FoodCategory
        ( name )
VALUES  ( N'Sinh tố' )
INSERT dbo.FoodCategory
        ( name )
VALUES  ( N'Nước ép' )
INSERT dbo.FoodCategory
        ( name )
VALUES  ( N'Đá xay' )
INSERT dbo.FoodCategory
        ( name )
VALUES  ( N'Sữa chua' )

-- thêm món ăn
INSERT dbo.Food
        ( name, idCategory, price )
VALUES  ( N'Sinh tố đu đủ', 
          2,
          25000)
INSERT dbo.Food
        ( name, idCategory, price )
VALUES  ( N'Cafe đen nóng', 1, 20000)
INSERT dbo.Food
        ( name, idCategory, price )
VALUES  ( N'Cafe sữa đá', 1, 24000)
INSERT dbo.Food
        ( name, idCategory, price )
VALUES  ( N'Cafe sữa nóng', 1, 24000)

