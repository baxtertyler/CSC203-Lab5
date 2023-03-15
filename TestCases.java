package equality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.util.List;
import java.util.ArrayList;



import java.util.Arrays;
import java.time.LocalTime;

import org.junit.Test;

public class TestCases
{
   @Test
   public void testExercise1()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testExercise2()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(1, 10), LocalTime.of(2, 0));

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise3()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise4()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
         LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }




   @Test
   public void testCourseSectionEqualsAndHash()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
      assertEquals(one.hashCode(), two.hashCode());

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testStudentEqualsAndHash()
   {
      List<CourseSection> l1 = new ArrayList<>();
      l1.add(new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0)));
      List<CourseSection> l2 = new ArrayList<>();
      l2.add(new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0)));

      final Student one = new Student("Baxter", "Tyler", 19, l1);
      final Student two = new Student("Baxter", "Tyler", 19, l2);

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));

      assertEquals(one.hashCode(), two.hashCode());
      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testCourseSectionNotEqualsAndHash()
   {
      final CourseSection one = new CourseSection("CSC", "202", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
      assertNotEquals(one.hashCode(), two.hashCode());

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testStudentNotEqualsAndHash()
   {
      List<CourseSection> l1 = new ArrayList<>();
      l1.add(new CourseSection("CSC", "202", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0)));
      List<CourseSection> l2 = new ArrayList<>();
      l2.add(new CourseSection("CSC", "203", 35,
              LocalTime.of(9, 40), LocalTime.of(11, 0)));

      final Student one = new Student("Baxter", "Tyler", 19, l1);
      final Student two = new Student("Baxter", "Tyler", 19, l2);

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));

      assertNotEquals(one.hashCode(), two.hashCode());
      assertNotEquals(one.hashCode(), two.hashCode());
   }
}
