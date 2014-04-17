/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgFestival;

import org.hibernate.Session;
import pkgEntite.HibernateUtil;
/**
 *
 * @author etudsio
 */
public class JprjFestival {
        private Session session = HibernateUtil.getSessionFactory().openSession();
	
        /**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
	}
        
        public static Session getSession() {
            return session;
        }

        public static void setSession(Session session) {
            this.session = session;
    }
	
}
