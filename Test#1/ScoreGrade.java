
class ScoreGrade 
{

private double testscore1, testscore2, testscore3;



public double CalculateAverage(double testscore1, double testscore2, double testscore3)
{
    double average;

    average = (testscore1+testscore2+testscore3) / 3;
    return average;
}

public double MaxScore(double testscore1, double testscore2, double testscore3)
{
    if (testscore1 > testscore2)
    {
        return testscore1;
    }
    else if (testscore2 > testscore3)
    {
        return testscore2;
    }
        else 
        {
        return testscore3;
        }


}

}