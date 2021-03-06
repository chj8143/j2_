package com.j2.state.player;

public class HasCDState implements State {
 MediaPlayer mp;
 
 public HasCDState(MediaPlayer mp) {
  this.mp = mp;
 }
  
 public void insertCD() {
  System.out.println("You can't insert another CD");
 }
 
 public void ejectCD() {
  System.out.println("CD returned");
  mp.setState(mp.getNoCDState());
 }
 public void play() {
   System.out.println("Start to playing CD"); 
   mp.setState(mp.getPlayedState());
 }
 public void displayOff() {
   System.out.println("Display off"); 
   //mp.setState(mp.getStoppedState());
 }
 public void displaySleep() {
   System.out.println("Sleep Mode"); 
 }
 public String toString() {
  return "waiting for start of playing";
 }
}