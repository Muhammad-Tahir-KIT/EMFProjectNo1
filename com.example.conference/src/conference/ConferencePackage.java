/**
 */
package conference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/conference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferencePackage eINSTANCE = conference.impl.ConferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SpeakerImpl
	 * @see conference.impl.ConferencePackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.TalkImpl <em>Talk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.TalkImpl
	 * @see conference.impl.ConferencePackageImpl#getTalk()
	 * @generated
	 */
	int TALK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__SPEAKER = 1;

	/**
	 * The number of structural features of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.ConferenceImpl
	 * @see conference.impl.ConferencePackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Talk</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__TALK = 1;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__SPEAKERS = 2;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link conference.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see conference.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for the attribute '{@link conference.Speaker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Speaker#getName()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Name();

	/**
	 * Returns the meta object for class '{@link conference.Talk <em>Talk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talk</em>'.
	 * @see conference.Talk
	 * @generated
	 */
	EClass getTalk();

	/**
	 * Returns the meta object for the attribute '{@link conference.Talk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Talk#getName()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Name();

	/**
	 * Returns the meta object for the containment reference '{@link conference.Talk#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speaker</em>'.
	 * @see conference.Talk#getSpeaker()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Speaker();

	/**
	 * Returns the meta object for class '{@link conference.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see conference.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the attribute '{@link conference.Conference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Conference#getName()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Name();

	/**
	 * Returns the meta object for the reference list '{@link conference.Conference#getTalk <em>Talk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Talk</em>'.
	 * @see conference.Conference#getTalk()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Talk();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speakers</em>'.
	 * @see conference.Conference#getSpeakers()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Speakers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConferenceFactory getConferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conference.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SpeakerImpl
		 * @see conference.impl.ConferencePackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__NAME = eINSTANCE.getSpeaker_Name();

		/**
		 * The meta object literal for the '{@link conference.impl.TalkImpl <em>Talk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.TalkImpl
		 * @see conference.impl.ConferencePackageImpl#getTalk()
		 * @generated
		 */
		EClass TALK = eINSTANCE.getTalk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__NAME = eINSTANCE.getTalk_Name();

		/**
		 * The meta object literal for the '<em><b>Speaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__SPEAKER = eINSTANCE.getTalk_Speaker();

		/**
		 * The meta object literal for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.ConferenceImpl
		 * @see conference.impl.ConferencePackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__NAME = eINSTANCE.getConference_Name();

		/**
		 * The meta object literal for the '<em><b>Talk</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__TALK = eINSTANCE.getConference_Talk();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__SPEAKERS = eINSTANCE.getConference_Speakers();

	}

} //ConferencePackage
