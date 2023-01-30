package Figure.Quadrato;

import java.awt.Rectangle;

public class Square extends Rectangle 
{
    public Square(int center_x, int center_y, int side_lenght)
    {
        super(center_x - side_lenght/2, center_y - side_lenght/2, side_lenght, side_lenght);
    }

    public int getArea()
    {
        return this.width * this.width;
    }

    public void setSize(int w, int h)
    {
        if (w != h) 
        {
            throw new IllegalArgumentException();
        }
        else 
        {
            this.width = w;
            this.height = w;
        }
    }

    public void setSize(int dim)
    {
        this.width = dim;
        this.height = dim;
    }
}