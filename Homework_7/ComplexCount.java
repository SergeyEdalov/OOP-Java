package Homeworks.Homework_7;

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

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

}
