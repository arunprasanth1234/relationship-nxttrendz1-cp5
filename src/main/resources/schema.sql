create table if not exists product(
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName varchar(255),
    price DOUBLE
); 

create table if not exists review(
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent varchar(255),
    rating INTEGER,
    productId INT,
    FOREIGN KEY (productId) REFERENCE product(productId)
); 
