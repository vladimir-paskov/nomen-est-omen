package com.vmsoft.nomen.fixture;

import com.vmsoft.nomen.Nomen;

/**
 * Test version.
 */
public class TestNomen extends Nomen {

	@Override
	public Nomen adjective() {
		super.template.add(() -> "adj");
		return this;
	}

	@Override
	public Nomen color() {
		super.template.add(() -> "col");
		return this;
	}

	@Override
	public Nomen person() {
		super.template.add(() -> "person");
		return this;
	}

	@Override
	public Nomen pokemon() {
		super.template.add(() -> "pokemon");
		return this;
	}

	@Override
	public Nomen superb() {
		super.template.add(() -> "sup");
		return this;
	}

	@Override
	public Nomen superhero() {
		super.template.add(() -> "Mrs BAT Marvel III");
		return this;
	}
}
