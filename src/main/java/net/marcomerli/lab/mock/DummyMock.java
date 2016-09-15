package net.marcomerli.lab.mock;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class DummyMock {

	protected Long a;
	protected Double b;
	protected int c;
	protected String d;
	protected Boolean e;
	protected BigDecimal f;
	protected String[] g;

	public DummyMock() {}

	public DummyMock(Long a, Double b, int c, String d, Boolean e, BigDecimal f, String[] g) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
	}

	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	public Long getA()
	{
		return a;
	}

	public void setA(Long a)
	{
		this.a = a;
	}

	public Double getB()
	{
		return b;
	}

	public void setB(Double b)
	{
		this.b = b;
	}

	public int getC()
	{
		return c;
	}

	public void setC(int c)
	{
		this.c = c;
	}

	public String getD()
	{
		return d;
	}

	public void setD(String d)
	{
		this.d = d;
	}

	public Boolean getE()
	{
		return e;
	}

	public void setE(Boolean e)
	{
		this.e = e;
	}

	public BigDecimal getF()
	{
		return f;
	}

	public void setF(BigDecimal f)
	{
		this.f = f;
	}

	public String[] getG()
	{
		return g;
	}

	public void setG(String[] g)
	{
		this.g = g;
	}
}
