/**
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id$
 */
package ac.soton.multisim.impl;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.IAxisScalePolicy;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.ZoomableChart;
import info.monitorenter.gui.chart.axis.AxisLinear;
import info.monitorenter.gui.chart.labelformatters.LabelFormatterNumber;
import info.monitorenter.gui.chart.traces.Trace2DLtd;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Random;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;
import ac.soton.multisim.Component;
import ac.soton.multisim.DisplayComponent;
import ac.soton.multisim.DisplayPort;
import ac.soton.multisim.MultisimPackage;
import ac.soton.multisim.Port;
import ac.soton.multisim.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.multisim.impl.DisplayComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ac.soton.multisim.impl.DisplayComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link ac.soton.multisim.impl.DisplayComponentImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link ac.soton.multisim.impl.DisplayComponentImpl#getBufferSize <em>Buffer Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisplayComponentImpl extends EventBNamedCommentedElementImpl implements DisplayComponent {

	/**
	 * Random colour generator.
	 * @custom
	 */
	private Random random = new Random(System.currentTimeMillis());

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2015 University of Southampton.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inputs;
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> outputs;
	/**
	 * The default value of the '{@link #getChart() <em>Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected static final Chart2D CHART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected Chart2D chart = CHART_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BUFFER_SIZE_EDEFAULT = 1500;
	/**
	 * The cached value of the '{@link #getBufferSize() <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSize()
	 * @generated
	 * @ordered
	 */
	protected int bufferSize = BUFFER_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MultisimPackage.Literals.DISPLAY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList.Resolving<Port>(Port.class, this, MultisimPackage.DISPLAY_COMPONENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList.Resolving<Port>(Port.class, this, MultisimPackage.DISPLAY_COMPONENT__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart2D getChart() {
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChart(Chart2D newChart) {
		Chart2D oldChart = chart;
		chart = newChart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisimPackage.DISPLAY_COMPONENT__CHART, oldChart, chart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBufferSize() {
		return bufferSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBufferSize(int newBufferSize) {
		int oldBufferSize = bufferSize;
		bufferSize = newBufferSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MultisimPackage.DISPLAY_COMPONENT__BUFFER_SIZE, oldBufferSize, bufferSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	public void instantiate() {
		if (chart == null) {
			
			// new chart with double-click zoom out
			chart = new ZoomableChart() {
				long lastClickTime;
				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					if (e.getWhen() - lastClickTime < 500)
						this.zoomAll();
					lastClickTime = e.getWhen();
				}
			};
			
			// remove original axes
		    chart.removeAxisXBottom(chart.getAxisX());
		    chart.removeAxisYLeft(chart.getAxisY());
		    
		    // empty label formatter for drawing border-like axes without marks
		    LabelFormatterNumber lf = new LabelFormatterNumber(NumberFormat.getNumberInstance()) {
		    	@Override
		    	public String format(double value) {
		    		return "0";
		    	}
		    };
		    
		    // set new axes (draw x/y at the top/right to make a border, but without the scale)
		    chart.setAxisXBottom(new AxisLinear<IAxisScalePolicy>(new LabelFormatterNumber(NumberFormat.getNumberInstance())), 0);
		    chart.setAxisYLeft(new AxisLinear<IAxisScalePolicy>(new LabelFormatterNumber(NumberFormat.getNumberInstance())), 0);
		    chart.setAxisYRight(new AxisLinear<IAxisScalePolicy>(lf), 0);
		    chart.setAxisXTop(new AxisLinear<IAxisScalePolicy>(lf), 0);
		    
		    // show grid
		    chart.getAxisX().setPaintGrid(true);
		    chart.getAxisY().setPaintGrid(true);
		    chart.setGridColor(new Color(224,224,224));
		    
		    // remove titles
		    chart.getAxisX().getAxisTitle().setTitle("");
		    chart.getAxisY().getAxisTitle().setTitle("");
		    
		    chart.setVisible(false);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initialise(int tStart, int tStop) {
		// remove previous traces
		chart.removeAllTraces();	//XXX: is that required? do removed ports keep traces in a chart?

	    // disable notification
	    for (Port p : getInputs())
			p.eSetDeliver(false);

		// setup traces for all connected ports
		for (Port p : getInputs()) {
			DisplayPort port = (DisplayPort) p;
			Port input = port.getIn();
			
			if (input == null)
				continue;
			
			// prepare traces
		    ITrace2D trace = port.getTrace();
		    if (trace == null) {
		    	trace = new Trace2DLtd(bufferSize);
			    port.setTrace(trace);
		    } else {
		    	trace.removeAllPoints();
		    }
		    
		    // trace name = input component&port name 
			trace.setName(((Component) input.eContainer()).getName() + "." + input.getName());
		    
		    // set/generate colour
		    Color colour = port.getColor();
		    if (colour == null)
		    	colour = generateNewColour();
		    trace.setColor(colour);
		    
		    chart.addTrace(trace);
		}
	}

	/**
	 * Generate a random colour.
	 * 
	 * @return
	 * @custom
	 */
	private Color generateNewColour() {
		final float hue = random.nextFloat();
		// Saturation between 0.7 and 0.9
		final float saturation = (random.nextInt(2000) + 7000) / 10000f;
		final float luminance = 0.8f;
		return Color.getHSBColor(hue, saturation, luminance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void readInputs() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void writeOutputs() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void doStep(int time, int step) {
		DisplayPort port = null;
		Port input = null;
		for (Port p : getInputs()) {
			port = (DisplayPort) p;
			input = port.getIn();
			
			// if port connected, plot the value
			if (input != null) {
				Object value = input.getValue();
				double traceValue = 0;
				if (input.getType() == VariableType.REAL) {
					traceValue = ((Double) value).doubleValue();
				} else if (input.getType() == VariableType.INTEGER) {
					traceValue = ((Integer) value).intValue();
				} else if (input.getType() == VariableType.BOOLEAN) {
					traceValue = ((Boolean) value).booleanValue() ? 1 : 0;
				}
				port.getTrace().addPoint(time/1000.0, traceValue);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void terminate() {
	    // re-enable notification
	    for (Port p : getInputs())
			p.eSetDeliver(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MultisimPackage.DISPLAY_COMPONENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case MultisimPackage.DISPLAY_COMPONENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case MultisimPackage.DISPLAY_COMPONENT__INPUTS:
				return getInputs();
			case MultisimPackage.DISPLAY_COMPONENT__OUTPUTS:
				return getOutputs();
			case MultisimPackage.DISPLAY_COMPONENT__CHART:
				return getChart();
			case MultisimPackage.DISPLAY_COMPONENT__BUFFER_SIZE:
				return getBufferSize();
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
			case MultisimPackage.DISPLAY_COMPONENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Port>)newValue);
				return;
			case MultisimPackage.DISPLAY_COMPONENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Port>)newValue);
				return;
			case MultisimPackage.DISPLAY_COMPONENT__CHART:
				setChart((Chart2D)newValue);
				return;
			case MultisimPackage.DISPLAY_COMPONENT__BUFFER_SIZE:
				setBufferSize((Integer)newValue);
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
			case MultisimPackage.DISPLAY_COMPONENT__INPUTS:
				getInputs().clear();
				return;
			case MultisimPackage.DISPLAY_COMPONENT__OUTPUTS:
				getOutputs().clear();
				return;
			case MultisimPackage.DISPLAY_COMPONENT__CHART:
				setChart(CHART_EDEFAULT);
				return;
			case MultisimPackage.DISPLAY_COMPONENT__BUFFER_SIZE:
				setBufferSize(BUFFER_SIZE_EDEFAULT);
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
			case MultisimPackage.DISPLAY_COMPONENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case MultisimPackage.DISPLAY_COMPONENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case MultisimPackage.DISPLAY_COMPONENT__CHART:
				return CHART_EDEFAULT == null ? chart != null : !CHART_EDEFAULT.equals(chart);
			case MultisimPackage.DISPLAY_COMPONENT__BUFFER_SIZE:
				return bufferSize != BUFFER_SIZE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (chart: ");
		result.append(chart);
		result.append(", bufferSize: ");
		result.append(bufferSize);
		result.append(')');
		return result.toString();
	}

} //DisplayComponentImpl
