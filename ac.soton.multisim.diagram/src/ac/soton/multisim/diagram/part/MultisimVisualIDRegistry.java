/*
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.multisim.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ac.soton.multisim.ComponentDiagram;
import ac.soton.multisim.DisplayPort;
import ac.soton.multisim.EventBPort;
import ac.soton.multisim.FMUPort;
import ac.soton.multisim.MultisimPackage;
import ac.soton.multisim.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.multisim.diagram.edit.parts.DisplayComponentEditPart;
import ac.soton.multisim.diagram.edit.parts.DisplayPortEditPart;
import ac.soton.multisim.diagram.edit.parts.EventBComponentEditPart;
import ac.soton.multisim.diagram.edit.parts.EventBComponentEventBVariablesCompartmentEditPart;
import ac.soton.multisim.diagram.edit.parts.EventBComponentNameEditPart;
import ac.soton.multisim.diagram.edit.parts.EventBInputPortEditPart;
import ac.soton.multisim.diagram.edit.parts.EventBOutputPortEditPart;
import ac.soton.multisim.diagram.edit.parts.FMUComponentEditPart;
import ac.soton.multisim.diagram.edit.parts.FMUComponentFMUVariablesCompartmentEditPart;
import ac.soton.multisim.diagram.edit.parts.FMUComponentNameEditPart;
import ac.soton.multisim.diagram.edit.parts.FMUInputPortEditPart;
import ac.soton.multisim.diagram.edit.parts.FMUOutputPortEditPart;
import ac.soton.multisim.diagram.expressions.MultisimOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MultisimVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ac.soton.multisim.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MultisimDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MultisimPackage.eINSTANCE.getComponentDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ComponentDiagram) domainElement)) {
			return ComponentDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			if (MultisimPackage.eINSTANCE.getDisplayComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return DisplayComponentEditPart.VISUAL_ID;
			}
			if (MultisimPackage.eINSTANCE.getFMUComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return FMUComponentEditPart.VISUAL_ID;
			}
			if (MultisimPackage.eINSTANCE.getEventBComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return EventBComponentEditPart.VISUAL_ID;
			}
			break;
		case DisplayComponentEditPart.VISUAL_ID:
			if (MultisimPackage.eINSTANCE.getDisplayPort().isSuperTypeOf(
					domainElement.eClass())
					&& isDisplayPort_3001((DisplayPort) domainElement)) {
				return DisplayPortEditPart.VISUAL_ID;
			}
			break;
		case FMUComponentEditPart.VISUAL_ID:
			if (MultisimPackage.eINSTANCE.getFMUPort().isSuperTypeOf(
					domainElement.eClass())
					&& isFMUPort_3002((FMUPort) domainElement)) {
				return FMUInputPortEditPart.VISUAL_ID;
			}
			if (MultisimPackage.eINSTANCE.getFMUPort().isSuperTypeOf(
					domainElement.eClass())
					&& isFMUPort_3003((FMUPort) domainElement)) {
				return FMUOutputPortEditPart.VISUAL_ID;
			}
			break;
		case EventBComponentEditPart.VISUAL_ID:
			if (MultisimPackage.eINSTANCE.getEventBPort().isSuperTypeOf(
					domainElement.eClass())
					&& isEventBPort_3005((EventBPort) domainElement)) {
				return EventBInputPortEditPart.VISUAL_ID;
			}
			if (MultisimPackage.eINSTANCE.getEventBPort().isSuperTypeOf(
					domainElement.eClass())
					&& isEventBPort_3006((EventBPort) domainElement)) {
				return EventBOutputPortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			if (DisplayComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FMUComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventBComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DisplayComponentEditPart.VISUAL_ID:
			if (DisplayPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FMUComponentEditPart.VISUAL_ID:
			if (FMUComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FMUComponentFMUVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FMUInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FMUOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventBComponentEditPart.VISUAL_ID:
			if (EventBComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventBComponentEventBVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventBInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EventBOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ComponentDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isDisplayPort_3001(DisplayPort domainElement) {
		Object result = MultisimOCLFactory.getExpression(0,
				MultisimPackage.eINSTANCE.getDisplayPort(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFMUPort_3002(FMUPort domainElement) {
		Object result = MultisimOCLFactory.getExpression(2,
				MultisimPackage.eINSTANCE.getFMUPort(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFMUPort_3003(FMUPort domainElement) {
		Object result = MultisimOCLFactory.getExpression(4,
				MultisimPackage.eINSTANCE.getFMUPort(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEventBPort_3005(EventBPort domainElement) {
		Object result = MultisimOCLFactory.getExpression(6,
				MultisimPackage.eINSTANCE.getEventBPort(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isEventBPort_3006(EventBPort domainElement) {
		Object result = MultisimOCLFactory.getExpression(8,
				MultisimPackage.eINSTANCE.getEventBPort(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FMUComponentFMUVariablesCompartmentEditPart.VISUAL_ID:
		case EventBComponentEventBVariablesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return false;
		case DisplayPortEditPart.VISUAL_ID:
		case FMUInputPortEditPart.VISUAL_ID:
		case FMUOutputPortEditPart.VISUAL_ID:
		case EventBInputPortEditPart.VISUAL_ID:
		case EventBOutputPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ac.soton.multisim.diagram.part.MultisimVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
