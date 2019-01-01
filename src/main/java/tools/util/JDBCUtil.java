package tools.util;




import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil   {
/*加载驱动*/
    static {
        try {
            new Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*连接到数据库*/
    private static final String URL = "jdbc:mysql://localhost/arm?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
/*连接通道*/
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn =  DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
/*关闭通道*/
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
/*封装增删改*/
     public static int executeUpdate(String sql, Object...obj){
         int a = 0;
         Connection conn = null;
         PreparedStatement pstmt = null;

         conn = getConnection();

         try {
             conn.setAutoCommit(false);  //自动提交关闭
             pstmt= conn.prepareStatement(sql);
             if (obj!=null){
                 for (int i=0;i<obj.length; i++){
                     pstmt.setObject(i+1,obj[i]);
                 }
             }
             a = pstmt.executeUpdate();
             System.out.println(a);
             conn.commit();
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return a;
     }
/*封装查询*/
    public static <T> List<T> executeQuery(String sql, RowMap<T> rm, Object...obj){
        List<T>list =new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        conn = getConnection();

        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            if (obj!=null){
                for (int i= 0; i<obj.length;i++){
                    pstmt.setObject(i + 1,obj[i]);
                }
            }
            rs = pstmt.executeQuery();
            while (rs.next()){
                T g = rm.RowMaping(rs);
                list.add(g);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            close(rs,pstmt,conn);
        }
        return list;
    }
/*封装查询一个*/
public static <T> T getOne(String sql,RowMap<T> rm , Object...obj){
    T a = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    conn = getConnection();

    try {
        conn.setAutoCommit(false);
        pstmt = conn.prepareStatement(sql);
        if (obj!=null){
            for (int i= 0; i<obj.length;i++){
                pstmt.setObject(i+1,obj[i]);
            }
        }
        rs = pstmt.executeQuery();
        while (rs.next()){
           a=rm.RowMaping(rs);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    finally {
        close(rs,pstmt,conn);
    }
    return a;
}
/*封装统计数量*/
public static int executeCount(String sql,  Object... obj) {
    int a = 0;
    Connection con = null;
    PreparedStatement pstmt = null;
    con = getConnection();
    ResultSet rs = null;

    try {
        con.setAutoCommit(false);
        pstmt = con.prepareStatement(sql);
        if (obj != null) {
            for (int i = 0; i < obj.length; i++) {
                pstmt.setObject(i + 1, obj[i]);
            }
        }
        rs = pstmt.executeQuery();
        while (rs.next()) {
            a = rs.getInt(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        close(null, pstmt, con);
    }
    return a;
}


}
