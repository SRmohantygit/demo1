package com.Flight_reservation_web_5.dto;

public class Reservationregister {
 private long flightId;
 private String firstName;
 private String lastName;
 private String middleName;
 private String email;
 private String phone;
private String CardNumber;
private String CVV;
private String ExpiryDate;
private String Amount;
public long getFlightId() {
	return flightId;
}
public void setFlightId(long flightId) {
	this.flightId = flightId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getCardNumber() {
	return CardNumber;
}
public void setCardNumber(String cardNumber) {
	CardNumber = cardNumber;
}
public String getCVV() {
	return CVV;
}
public void setCVV(String cVV) {
	CVV = cVV;
}
public String getExpiryDate() {
	return ExpiryDate;
}
public void setExpiryDate(String expiryDate) {
	ExpiryDate = expiryDate;
}
public String getAmount() {
	return Amount;
}
public void setAmount(String amount) {
	Amount = amount;
}


}
