package calculator;

class SubtractExpression extends BinaryExpression
{
   //private final Expression lft;
   //private final Expression rht;

   public SubtractExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "-");
   }

   @Override
   protected double _applyOperator(double left, double right) {
      return left - right;
   }
/*
   public String toString()
   {
      return "(" + lft + " - " + rht + ")";
   }

   public double evaluate(final Bindings bindings)
   {
      return lft.evaluate(bindings) - rht.evaluate(bindings);
   }
 */
}

