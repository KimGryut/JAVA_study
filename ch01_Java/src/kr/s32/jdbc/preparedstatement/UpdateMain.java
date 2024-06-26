package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.util.DBUtil;

public class UpdateMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			// JDBC 수행 1, 2단계
			conn = DBUtil.getConnection();
			// SQL문 작성
			sql = "UPDATE test2 SET name =?, age=? WHERE id=?";

			// JDBC 3단계 
			pstmt = conn.prepareStatement(sql);
			
			// ?에 바인딩
			pstmt.setString(1, "강호동");
			pstmt.setInt(2, 40);
			pstmt.setString(3, "sky");
			
			// JDBC 수행 4단계 : SQL문을 실행해서 테이블의 데이터 수정
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			

				
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
