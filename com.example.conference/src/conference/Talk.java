/**
 */
package conference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Talk#getName <em>Name</em>}</li>
 *   <li>{@link conference.Talk#getSpeaker <em>Speaker</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getTalk_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Talk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' containment reference.
	 * @see #setSpeaker(Speaker)
	 * @see conference.ConferencePackage#getTalk_Speaker()
	 * @model containment="true"
	 * @generated
	 */
	Speaker getSpeaker();

	/**
	 * Sets the value of the '{@link conference.Talk#getSpeaker <em>Speaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' containment reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(Speaker value);

} // Talk
