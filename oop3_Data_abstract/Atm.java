package oop3_Data_abstract;

abstract public class Atm {
	abstract public int withdraw (int amount);
	abstract public float balance (int pin);
	abstract public int changePin(int newpin);

}
