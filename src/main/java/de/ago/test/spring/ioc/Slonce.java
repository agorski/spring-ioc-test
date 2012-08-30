package de.ago.test.spring.ioc;

/**
 * Created with IntelliJ IDEA.
 * User: mrgreen
 * Date: 30.08.12
 * Time: 23:27
 * To change this template use File | Settings | File Templates.
 */
public class Slonce {

  public Slonce(String nazwa) {
    this.nazwa = nazwa;
  }

  public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

  @Override
  public String toString() {
    return "Slonce{" +
        "nazwa='" + nazwa + '\'' +
        '}';
  }

  private String nazwa;
    private int wiek;
}
