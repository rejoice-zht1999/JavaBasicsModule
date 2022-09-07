package com.zht.Document;

import java.io.*;

public class Fileinputstream {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zht-mac/Downloads/delegate_result.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int i = 0;
        StringBuffer insertSql = new StringBuffer();
        insertSql.append("insert all \r\n");
        while ((st = br.readLine()) != null) {
            String[] split = st.split(",");
            String indexcode = split[3];
            i++;
            String lastStr = indexcode.substring(5, 7);
            if ("01".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'03\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'" + split[4] + "\') \r\n ");
            } else if ("06".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'400\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("11".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'400\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n ");
            } else if ("16".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'<1KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("21".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'1-10KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("26".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'35KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("31".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'1-10VK\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("36".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'35KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("41".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'110KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("46".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'220KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("51".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'>=330KV\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'01\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else if ("56".equals(lastStr)) {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'" + Double.valueOf(split[4]) * 10 + "\') \r\n");
            } else if ("61".equals(lastStr)) {

                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'200\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            } else {
                insertSql.append(" into DAIGOUELECTRIC0824.DGD_POWER_DEVIATION_ANALYSIS " +
                        "(ID,ORG_NO,NY,MARKET_PROP_SORT,ELEC_TYPE_CODE,VOLT_CODE,TRADE_CODE,ELEC_STRATE,PLAN_POWER) " +
                        "values ");
                insertSql.append("(" + i);
                insertSql.append(",\'" + split[0] + "\'");
                insertSql.append(",\'" + split[1] + "0" +split[2] + "\'");
                insertSql.append(",\'02\'");
                insertSql.append(",\'300\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'\'");
                insertSql.append(",\'" + split[4] + "\') \r\n");
            }
        }
        insertSql.append("select * from dual;");
        System.out.println(insertSql);
        OutputStream fs = null;
        try {
            fs = new FileOutputStream(new File("/Users/zht-mac/Downloads/delegate_result.sql"), true);
            fs.write(insertSql.toString().getBytes());
        } catch (Exception e) {
        } finally {
            fs.close();
        }
    }
}
