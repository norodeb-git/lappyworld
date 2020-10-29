package com.norodeb.lappyworld.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LAPPY")
public class Lappy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LAPPY_ID")
	private int lappyId;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "LAPPY_MODEL")
	private String modelName;

	@Column(name = "DISPLAY_SIZE")
	private String screenSize;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "PROCESSOR")
	private String processor;

	@Column(name = "RAM_SIZE")
	private String ram;

	@Column(name = "Memory_SIZE")
	private String memorySize;

	public int getLappyId() {
		return lappyId;
	}

	public void setLappyId(int lappyId) {
		this.lappyId = lappyId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + lappyId;
		result = prime * result + ((memorySize == null) ? 0 : memorySize.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		result = prime * result + ((screenSize == null) ? 0 : screenSize.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lappy other = (Lappy) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (lappyId != other.lappyId)
			return false;
		if (memorySize == null) {
			if (other.memorySize != null)
				return false;
		} else if (!memorySize.equals(other.memorySize))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		if (screenSize == null) {
			if (other.screenSize != null)
				return false;
		} else if (!screenSize.equals(other.screenSize))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lappy [lappyId=" + lappyId + ", brand=" + brand + ", modelName=" + modelName + ", screenSize="
				+ screenSize + ", color=" + color + ", processor=" + processor + ", ram=" + ram + ", memorySize="
				+ memorySize + "]";
	}

}
