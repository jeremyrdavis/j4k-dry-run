package org.j4k.workshops.quarkus.favfood.domain;

import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class FavFoodOrder {

    String orderId;

    String customerName;

    List<FavFoodLineItem> favFoodLineItems;

    public FavFoodOrder(){

	}

	/**
	 * @param orderId
	 * @param customerName
	 * @param favFoodLineItems
	 */
	public FavFoodOrder(String orderId, String customerName, List<FavFoodLineItem> favFoodLineItems) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.favFoodLineItems = favFoodLineItems;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "FavFoodOrder [customerName=" + customerName + ", favFoodLineItems=" + favFoodLineItems + ", orderId="
				+ orderId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((favFoodLineItems == null) ? 0 : favFoodLineItems.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavFoodOrder other = (FavFoodOrder) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (favFoodLineItems == null) {
			if (other.favFoodLineItems != null)
				return false;
		} else if (!favFoodLineItems.equals(other.favFoodLineItems))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the favFoodLineItems
	 */
	public List<FavFoodLineItem> getFavFoodLineItems() {
		return favFoodLineItems;
	}

	/**
	 * @param favFoodLineItems the favFoodLineItems to set
	 */
	public void setFavFoodLineItems(List<FavFoodLineItem> favFoodLineItems) {
		this.favFoodLineItems = favFoodLineItems;
	}
	
	
}
