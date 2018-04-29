package com.kodonho.android.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Calculator calculator;
    // 먼저 테스트에서 사용할 클래스 또는 데이터를 생성
    @Before
    public void init(){
        calculator = new Calculator();
    }
    // sum함수에 대한 테스트 케이스를 설계한다.
    @Test
    public void testSum(){
        assertEquals(33, calculator.sum(30, 3));
    }
    @Test
    public void testMultiply() {
        assertEquals(90, calculator.multiply(30, 3));
    }
}