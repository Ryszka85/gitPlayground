package io.ryszka;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeTest {

    @Test
    public void fooTest() {
        assertThat("Foo").isEqualTo("Foo");
    }

    @Test
    public void fooTest2() {
        assertThat("bar").isEqualTo("bar");
    }

}