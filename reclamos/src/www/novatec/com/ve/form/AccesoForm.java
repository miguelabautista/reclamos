/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package www.novatec.com.ve.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-30-2010
 * 
 * XDoclet definition:
 * @struts.form name="accesoForm"
 */
public class AccesoForm extends ValidatorForm {
	/*
	 * Generated fields
	 */

	/** login property */
	private String login;

	/** password property */
	private String password;
	

	/*
	 * Generated Methods
	 */

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the login.
	 * @return String
	 */
	public String getLogin() {
		return login;
	}

	/** 
	 * Set the login.
	 * @param login The login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/** 
	 * Returns the password.
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/** 
	 * Set the password.
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}