/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Conference#getName <em>Name</em>}</li>
 *   <li>{@link conference.Conference#getTalk <em>Talk</em>}</li>
 *   <li>{@link conference.Conference#getSpeakers <em>Speakers</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getConference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Conference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Talk</b></em>' reference list.
	 * The list contents are of type {@link conference.Talk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talk</em>' reference list.
	 * @see conference.ConferencePackage#getConference_Talk()
	 * @model
	 * @generated
	 */
	EList<Talk> getTalk();

	/**
	 * Returns the value of the '<em><b>Speakers</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Speaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers</em>' containment reference list.
	 * @see conference.ConferencePackage#getConference_Speakers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Speaker> getSpeakers();

} // Conference
