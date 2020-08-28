package daoimpl;

import java.sql.*;
import java.io.*;
import dao.iEmployeeDao;
import model.Employee;
import config.JDBCConnection;


public class EmployeeDaoImpl implements iEmployeeDao{

	Connection conn=null;
	@Override
	public void getAllEmployees() {
		try {
			conn=JDBCConnection.getDBConnection();
			Statement stmt=conn.createStatement();
			ResultSet rst=stmt.executeQuery("select * from Employee");
			if(rst!=null) {
				Employee emp=new Employee();
				while(rst.next()) {
					emp.setEmpId(rst.getInt(1));
					emp.setFirstName(rst.getString(2));
					emp.setLastName(rst.getString(3));
					emp.setUserId(rst.getString(4));
					emp.setPassword(rst.getString(5));
					emp.setRole(rst.getString(6));
					emp.setGender(rst.getString(7));
					emp.setActive(rst.getString(8));
					System.out.println(emp);
				}
			}
			conn.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void addEmployee(Employee emp) {
		try {
			conn=JDBCConnection.getDBConnection();
			PreparedStatement pst=conn.prepareStatement("insert into Employee values(?,?,?,?,?,?,?)");
			pst.setString(1, emp.getFirstName());
			pst.setString(2, emp.getLastName());
			pst.setString(3, emp.getUserId());
			pst.setString(4, emp.getPassword());
			pst.setString(5, emp.getRole());
			pst.setString(6, emp.getGender());
			pst.setString(7, emp.getActive());
			int i=pst.executeUpdate();
			if(i==1)
				System.out.println("1 record inserted...");
			else
				System.out.println("insertion failed...");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivateEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

}
