package com.mountain.fileserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileServerApplicationTests {

    @Test
    void contextLoads() {
        StringBuffer attendSql = new StringBuffer();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/* dialect */ ");
        stringBuffer.append("SELECT ");
        stringBuffer.append("CAST(CASE WHEN SUM(a.S19+a.S21) - 30 > 0 THEN SUM(a.S19+a.S21) - 30 ELSE 0 END AS DECIMAL(18,2)) AS late_and_early_leave, ");
        stringBuffer.append("CAST(SUM(a.S23) AS DECIMAL(18,2)) AS absent, ");
        stringBuffer.append("CAST(SUM(a.S28) AS DECIMAL(18,2)) AS leave, ");
        stringBuffer.append("CAST(SUM(a.S37 + a.S34) AS DECIMAL(18,2)) AS legal_holiday_overtime, ");
        stringBuffer.append("CAST(SUM(a.S33 + a.S36) AS DECIMAL(18,2)) AS holiday_work_overtime, ");
        stringBuffer.append("CAST(SUM(a.S116) AS DECIMAL(18,2)) AS business_trip, ");
        stringBuffer.append("CAST(SUM(a.S117) AS DECIMAL(18,2)) AS out_of_office ");
        stringBuffer.append("FROM T_HR_ATS_AttendanceResult a ");
        stringBuffer.append("WHERE a.FPROPOSERID = '123123' ");
        stringBuffer.append("AND a.FAttenceDate >= DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE())-1, 0) ");
        stringBuffer.append("AND a.FAttenceDate <= EOMONTH(DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE())-1, 0))");



        System.out.println(stringBuffer);

    }

}
