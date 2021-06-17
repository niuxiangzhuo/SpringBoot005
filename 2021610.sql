CREATE TABLE PositionInformationSheet(
	jobsNumbers INT PRIMARY KEY AUTO_INCREMENT,
	postTheName VARCHAR(300) NOT NULL,
	postSalary DOUBLE NOT NULL
);

INSERT INTO PositionInformationSheet VALUE(0,'管理员',8000);
INSERT INTO PositionInformationSheet VALUE(0,'技术工',7500);
INSERT INTO PositionInformationSheet VALUE(0,'月工',5000);
INSERT INTO PositionInformationSheet VALUE(0,'普通员工',6000);
CREATE TABLE EmployeeInformationSheet(
	accountId VARCHAR(300) PRIMARY KEY,
	passwords VARCHAR(300) NOT NULL,
	theName VARCHAR(300) NOT NULL,
	jobsNumbers INT,
	contactPhoneNumber VARCHAR(300) NOT NULL,
	recordOfFormalSchooling VARCHAR(300) NOT NULL,
	CONSTRAINT EMPL_FK_POSI FOREIGN KEY (jobsNumbers) REFERENCES PositionInformationSheet(jobsNumbers)
);
      SELECT * FROM PositionInformationSheet
        SELECT * FROM EmployeeInformationSheet LEFT JOIN PositionInformationSheet ON EmployeeInformationSheet.`jobsNumbers`=PositionInformationSheet.`jobsNumbers` WHERE PositionInformationSheet.`jobsNumbers`!='4'
INSERT INTO EmployeeInformationSheet VALUE('123456789','123456789','莫得感情',4,'12345678911','博士');
INSERT INTO EmployeeInformationSheet VALUE('789456123','123456789','干将莫邪',1,'12345678912','中专');
INSERT INTO EmployeeInformationSheet VALUE('987456321','123456789','百里玄策',2,'12345678913','硕士');
INSERT INTO EmployeeInformationSheet VALUE('741258963','123456789','百里守约',3,'12345678914','本科');
INSERT INTO EmployeeInformationSheet VALUE('963258741','123456789','公孙离',1,'12345678915','大专');
INSERT INTO EmployeeInformationSheet VALUE('852147963','123456789','廉颇',2,'12345678916','小学');
CREATE TABLE SalaryInformationSheet(
	serialNumber INT PRIMARY KEY AUTO_INCREMENT,
	accountId VARCHAR(300),
	months DATE,
	grossSalary DOUBLE NOT NULL,
	takeHomePay DOUBLE NOT NULL,
	CONSTRAINT SALA_FK_EMPL FOREIGN KEY (accountId) REFERENCES EmployeeInformationSheet(accountId)
);