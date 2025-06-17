/**
 */
package conference.impl;

import conference.Conference;
import conference.ConferencePackage;
import conference.Speaker;
import conference.Talk;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.ConferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getTalk <em>Talk</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getSpeakers <em>Speakers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceImpl extends MinimalEObjectImpl.Container implements Conference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTalk() <em>Talk</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalk()
	 * @generated
	 * @ordered
	 */
	protected EList<Talk> talk;

	/**
	 * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakers()
	 * @generated
	 * @ordered
	 */
	protected EList<Speaker> speakers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.CONFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Talk> getTalk() {
		if (talk == null) {
			talk = new EObjectResolvingEList<Talk>(Talk.class, this, ConferencePackage.CONFERENCE__TALK);
		}
		return talk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Speaker> getSpeakers() {
		if (speakers == null) {
			speakers = new EObjectContainmentEList<Speaker>(Speaker.class, this, ConferencePackage.CONFERENCE__SPEAKERS);
		}
		return speakers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return ((InternalEList<?>)getSpeakers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				return getName();
			case ConferencePackage.CONFERENCE__TALK:
				return getTalk();
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return getSpeakers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.CONFERENCE__TALK:
				getTalk().clear();
				getTalk().addAll((Collection<? extends Talk>)newValue);
				return;
			case ConferencePackage.CONFERENCE__SPEAKERS:
				getSpeakers().clear();
				getSpeakers().addAll((Collection<? extends Speaker>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.CONFERENCE__TALK:
				getTalk().clear();
				return;
			case ConferencePackage.CONFERENCE__SPEAKERS:
				getSpeakers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.CONFERENCE__TALK:
				return talk != null && !talk.isEmpty();
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return speakers != null && !speakers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConferenceImpl
