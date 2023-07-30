package Homeworks.Homework_7.Count;

public class ComplexCount extends Count {
    Double realPart;
    Double imaginaryPart;


    public ComplexCount(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Double getRealPart() {
        return realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return "ComplexCount{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }
}
