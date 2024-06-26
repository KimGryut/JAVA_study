package kr.s32.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kr.util.DBUtil;

public class DeleteMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			// JDBC 수행 1, 2단계
			conn = DBUtil.getConnection();
			
			// SQL문 작성	
			sql = "DELETE FROM test2 Where id=?";

			// JDBC 수행 3단계 : PreparedStatment 객체 생성 -> 동시에 sql 문장 넣어줌 (statement와 다름)
			pstmt = conn.prepareStatement(sql);
			
			// ?에 데이터 바인딩
			pstmt.setString(1, "sky");
						
			// JDBC 4단계 : SQL문을 테이블에 반영해서 행을 삭제
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}


