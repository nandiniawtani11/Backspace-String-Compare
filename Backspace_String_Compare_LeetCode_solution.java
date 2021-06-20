class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }     
            }
        }
        String snew="";
        while(!stack.isEmpty())
        {
            snew=stack.pop()+snew;
            
        }
          for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                stack.push(t.charAt(i));
            }
            else{
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
         String tnew="";
        while(!stack.isEmpty())
        {
            tnew=stack.pop()+tnew;
            
        }
        
        return tnew.equals(snew);  
    }
}
