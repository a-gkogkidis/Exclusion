package com.substitution.utils.helper;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SubstanceEquivalence implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String _substance;
	private java.lang.String _response;

	public SubstanceEquivalence() {
	}

	public java.lang.String get_substance() {
		return this._substance;
	}

	public void set_substance(java.lang.String _substance) {
		this._substance = _substance;
	}

	public java.lang.String get_response() {
		return this._response;
	}

	public void set_response(java.lang.String _response) {
		this._response = _response;
	}

	public SubstanceEquivalence(java.lang.String _substance,
			java.lang.String _response) {
		this._substance = _substance;
		this._response = _response;
	}

}