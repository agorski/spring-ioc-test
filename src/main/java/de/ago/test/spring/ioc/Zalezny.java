package de.ago.test.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: mrgreen
 * Date: 30.08.12
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */
public class Zalezny {
  private Wstrzykiwana wstrzykiwana;

  private String werjsa;

  private String opis;

  private Slonce pierwszeSlonce;


  private Slonce drugieSlonce;

  public Wstrzykiwana getWstrzykiwana() {
    return wstrzykiwana;
  }

  @Autowired(required = false)
  public void setWstrzykiwana(Wstrzykiwana wstrzykiwana) {
    this.wstrzykiwana = wstrzykiwana;
  }

  public String getWerjsa() {
    return werjsa;
  }

  @Autowired(required = false)
  public void setWerjsa(String werjsa) {
    this.werjsa = werjsa;
  }

  public String getOpis() {
    return opis;
  }

  public void setOpis(String opis) {
    this.opis = opis;
  }

  public Slonce getPierwszeSlonce() {
    return pierwszeSlonce;
  }

  @Autowired(required = false)
  public void setPierwszeSlonce(Slonce pierwszeSlonce) {
    this.pierwszeSlonce = pierwszeSlonce;
  }

  public Slonce getDrugieSlonce() {
    return drugieSlonce;
  }

  public void setDrugieSlonce(Slonce drugieSlonce) {
    this.drugieSlonce = drugieSlonce;
  }
}
