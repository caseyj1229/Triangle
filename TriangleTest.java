import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void solution() {
        int[] A = {10,2,5,1,8,20};
        assertEquals(1,Triangle.solution(A));

        int[] B = {4,3};
        assertEquals(0,Triangle.solution(B));

        int[] C = {100,10,44,1,55,1200,11};
        assertEquals(0,Triangle.solution(C));

        int[] D = {7,7,7,8,8,8,9,9,9};
        assertEquals(1,Triangle.solution(D));

        int[] E = {-2};
        assertEquals(0,Triangle.solution(E));

        int[] F = {3,4,5};
        assertEquals(1,Triangle.solution(F));

    }
}