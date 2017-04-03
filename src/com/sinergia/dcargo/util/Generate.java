package com.sinergia.dcargo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.sinergia.dcargo.model.Person;
import com.sinergia.dcargo.model.User;

public class Generate {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://ec2-54-214-97-192.us-west-2.compute.amazonaws.com:3306/dcargo","root", "Monamis_123!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		MetadataSources metadata = new MetadataSources(
			    new StandardServiceRegistryBuilder()
			        .applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
			        .build());
		
		metadata.addAnnotatedClass(Person.class);
		metadata.addAnnotatedClass(User.class);
		
		SchemaExport export = new SchemaExport(
			    (MetadataImplementor) metadata.buildMetadata(),
			    conn // pre-configured Connection here
		);
		export.create(true, true);
		
			
	}

}
