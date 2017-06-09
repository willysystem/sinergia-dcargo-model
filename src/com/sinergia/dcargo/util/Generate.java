package com.sinergia.dcargo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.sinergia.dcargo.client.shared.Cliente;
import com.sinergia.dcargo.client.shared.Conocimiento;
import com.sinergia.dcargo.client.shared.Guia;
import com.sinergia.dcargo.client.shared.Item;
import com.sinergia.dcargo.client.shared.Oficina;
import com.sinergia.dcargo.client.shared.Persona;
import com.sinergia.dcargo.client.shared.Precio;
import com.sinergia.dcargo.client.shared.TipoPago;
import com.sinergia.dcargo.client.shared.Transportista;
import com.sinergia.dcargo.client.shared.Unidad;
import com.sinergia.dcargo.client.shared.Usuario;

/**
 * 
 * @author willy
 *
 */
public class Generate {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://ec2-34-209-245-202.us-west-2.compute.amazonaws.com:3306/dcargo","root", "Monamis_123!");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dcargo","root", "control123!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		MetadataSources metadata = new MetadataSources(
			    new StandardServiceRegistryBuilder()
			        .applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
			        .build());
		metadata.addAnnotatedClass(Cliente.class);
		metadata.addAnnotatedClass(Conocimiento.class);
		metadata.addAnnotatedClass(Guia.class);
		metadata.addAnnotatedClass(Oficina.class);
		metadata.addAnnotatedClass(Persona.class);
		metadata.addAnnotatedClass(TipoPago.class);
		metadata.addAnnotatedClass(Usuario.class);
		metadata.addAnnotatedClass(Transportista.class);
		metadata.addAnnotatedClass(Unidad.class);
		metadata.addAnnotatedClass(Item.class);
		metadata.addAnnotatedClass(Precio.class);
		
		SchemaExport export = new SchemaExport(
			    (MetadataImplementor) metadata.buildMetadata(),
			    conn // pre-configured Connection here
		);
		export.create(true, true);
		


			
	}

}
