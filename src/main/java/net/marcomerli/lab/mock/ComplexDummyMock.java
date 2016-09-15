package net.marcomerli.lab.mock;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class ComplexDummyMock extends DummyMock {

	protected DummyMock za;
	protected List<DummyMock> zb;
	protected DummyMock[] zc;
	protected Map<Long, DummyMock> zd;

	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	public DummyMock getZa()
	{
		return za;
	}

	public void setZa(DummyMock za)
	{
		this.za = za;
	}

	public List<DummyMock> getZb()
	{
		return zb;
	}

	public void setZb(List<DummyMock> zb)
	{
		this.zb = zb;
	}

	public void addZb(DummyMock e)
	{
		if (zb == null)
			zb = new LinkedList<DummyMock>();

		zb.add(e);
	}

	public DummyMock[] getZc()
	{
		return zc;
	}

	public void setZc(DummyMock[] zc)
	{
		this.zc = zc;
	}

	public Map<Long, DummyMock> getZd()
	{
		return zd;
	}

	public void setZd(Map<Long, DummyMock> zd)
	{
		this.zd = zd;
	}

	public void addZd(Long k, DummyMock e)
	{
		if (zd == null)
			zd = new LinkedHashMap<Long, DummyMock>();

		zd.put(k, e);
	}
}
