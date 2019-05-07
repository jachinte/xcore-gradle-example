/**
 */
package com.example.Example;

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
 * @see com.example.Example.ExampleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' modelDirectory='model/build/xcore/main' complianceLevel='8.0' basePackage='com.example'"
 * @generated
 */
public interface ExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Example";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.com/Example";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hcl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackage eINSTANCE = com.example.Example.impl.ExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.Example.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.Example.impl.ModelImpl
	 * @see com.example.Example.impl.ExamplePackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__GREETINGS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.Example.impl.GreetingImpl <em>Greeting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.Example.impl.GreetingImpl
	 * @see com.example.Example.impl.ExamplePackageImpl#getGreeting()
	 * @generated
	 */
	int GREETING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Greeting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREETING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.Example.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.example.Example.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.Example.Model#getGreetings <em>Greetings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Greetings</em>'.
	 * @see com.example.Example.Model#getGreetings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Greetings();

	/**
	 * Returns the meta object for class '{@link com.example.Example.Greeting <em>Greeting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greeting</em>'.
	 * @see com.example.Example.Greeting
	 * @generated
	 */
	EClass getGreeting();

	/**
	 * Returns the meta object for the attribute '{@link com.example.Example.Greeting#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.Example.Greeting#getName()
	 * @see #getGreeting()
	 * @generated
	 */
	EAttribute getGreeting_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleFactory getExampleFactory();

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
		 * The meta object literal for the '{@link com.example.Example.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.Example.impl.ModelImpl
		 * @see com.example.Example.impl.ExamplePackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

		/**
		 * The meta object literal for the '{@link com.example.Example.impl.GreetingImpl <em>Greeting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.Example.impl.GreetingImpl
		 * @see com.example.Example.impl.ExamplePackageImpl#getGreeting()
		 * @generated
		 */
		EClass GREETING = eINSTANCE.getGreeting();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

	}

} //ExamplePackage
