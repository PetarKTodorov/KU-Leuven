package application;

import util.StackIntf;
import util.StackStack;

import java.util.HashMap;


public class BracketParser implements BracketParserIntf
{
    StackIntf<Character> stack;
    HashMap<Character, Character> brackets;

    public BracketParser()
    {
        stack = new StackStack();
        brackets = new HashMap<>();
        brackets.put( ']', '[' );
        brackets.put( ')', '(' );
        brackets.put( '}', '{' );
    }

    @Override
    public boolean checkBrackets(String text)
    {
        stack.clear();
        for( int i = 0; i < text.length(); i++ )
        {
            char c = text.charAt( i );

            if( c == '[' || c == '(' || c == '{' )
            {
                stack.push( c );
            }
            else if( c == ']' || c == ')' || c == '}' )
            {
                Character cOpen = stack.pop();

                if( cOpen == null )
                {
                    return false;
                }
                else if( cOpen != brackets.get( c ) )
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
