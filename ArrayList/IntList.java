class IntList {
    
    private class ListCell {
        int content;
        ListCell next;
        
        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }
    
    public ListCell head;

    public IntList() {
        head = null;
    }
    
    public void addFirst(int x) {
        ListCell newHead = new ListCell(x, head);
        head = newHead;
    }

    public Integer getFirst() {
        
        // gibt erstes Element der List zurück, wenn es keins gibt dann Rückgabe = null
        Integer firstContent = 0;
        ListCell c = head;

        if(c == null)
        {
            firstContent = null;
            return firstContent;
        }
        else
        {
            if(c.next != null)
            {
                c = c.next;
            }

            firstContent = c.content;
            return firstContent;
        }
    }
    
    public boolean dropFirst() {
        // Enfernt das erste Element aus der Liste
        //Wenn ein Element aus der Liste entfernt wurde, wird true zurückgegeben, ansonsten (leere Liste) false
        ListCell c = head;
        while(c != null) ////&& c.next != null)??
        {
            head = c = c.next;
            return true;
        }
        return false;
    }

    public void addLast(int x) {
        
        ListCell newListCell = new ListCell(x, null);

        if(head == null)
        {
            head = newListCell;
        }
        
        ListCell c = head;
        while(c.next != null)
        {
            c = c.next;
        }
        
        c.next = newListCell;    }

    public Integer getLast() {
        // gibt letztes Element der List zurück, wenn es keins gibt dann Rückgabe = null
        Integer lastContent = 0;
        ListCell c = head;

        if(c == null)
        {
            return lastContent = null;
        }
        else
        {
            while(c.next != null)
            {
                c = c.next;
            }

            return lastContent = c.content;
        }

    }

    public boolean dropLast() {
        // Entfernt das letzte Element aus der Liste
        //Wenn ein Element aus der Liste entfernt wurde, wird true zurückgegeben, ansonsten (leere Liste) false
        
        ListCell c = head;
        if(c.next == null)
        {
            head = c = c.next;
            return false;
        }
        else
        {
            while(c.next != null)
            {
                c = c.next;
            }

            c.next = null; //c.next.next;
            return true;
        }
        
    }
    
    public void remove(int x) {
        // remove all list elements where content is equal to x
        
        ListCell c = head;
        
        while (c!= null && c.content == x)
        {
            head = c = c.next;
        }
        
        if(c == null) return;
        
        while(c.next != null)
        {
            if(c.next.content == x)
            {
                c.next = c.next.next;
            }
            else
            {
                c = c.next;
            }
        }
    }
    
    public boolean contains(int x) {
        
        for(ListCell c = head; c != null; c = c.next)
        {
            if(c.content == x)
            {
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        
        ListCell c = head;
        int size = 0;
        
        if(c == null)
        {
            return size;
        }
        else
        {
            while(c.next != null)
            {
                size++;
                c = c.next;
            }

            return size;
        }
    }
    
    public boolean isEmpty() {
        
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString() {

        ListCell c = head;
        String contentString ="";
        String fullString = "";

        if(c == null)
        {
            fullString = "[]";
        }
        else
        {
            while(c.next != null)
            {
                c = c.next;
                contentString += c.content  + ", ";
            }
            fullString = "[" + contentString + "]";
        }
        return fullString;
    }

    public Iterator iterator()
    {
        return new Iterator(head);
    }

    public class Iterator {
        private ListCell cursor;

        private Iterator(ListCell start)
        {
            cursor = start;
        }

        public boolean hasNext()
        {
            return (cursor != null);
        }

        public int next()
        {
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }
    }
}