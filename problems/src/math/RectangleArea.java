package math;

/*
 * Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.

The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).

The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).
Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
Output: 45
 */
public class RectangleArea {
	public static void main(String[] args) {
		RectangleArea a = new RectangleArea();
		System.out.println(a.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
		
	}
	    /**
	 * Calculate the overlapping area of two rectangles.
	 */
	public int overlapArea(int A, int B, int C, int D,
	     			        int E, int F, int G, int H) {
		/* Check if there is indeed an overlap.
	     * e.g.  E >= C  i.e. the most left point of the rectangle (EFGH) is 
	     *       on the right side of the most right point of the rectangle (ABCD),
	     *       therefore there is no overlapping.
	     */
		if ( (E>=C) || (F>= D) || (A>=G) || (B >= H) )
			return 0;

		/* bottom left point of the overlapping area. */
		int bl_x = Math.max(A, E);
		int bl_y = Math.max(B, F);

		/* top right point of the overlapping area. */
		int tr_x = Math.min(C, G);
		int tr_y = Math.min(D, H);
		
		return (tr_x - bl_x) * (tr_y - bl_y);
	}

	/**
	 * Calculate the area of a single rectangle.
	 */
	public int computeArea(int A, int B, int C, int D) {
		return (C-A) * (D-B);
	}

	/**
	 * Find the total area covered by two rectilinear rectangles in a 2D plane.
	 * Each rectangle is defined by its bottom left corner and top right corner.
	 */
	public int computeArea(int A, int B, int C, int D,
						   int E, int F, int G, int H) {
		// The addition of area of the two rectangles minus the overlapping area.
		return computeArea(A, B, C, D) + computeArea(E, F, G, H) - 
			   overlapArea(A, B, C, D, E, F, G, H);
	}
}
