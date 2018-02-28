package frc.team3323.Manipulator;

import edu.wpi.first.wpilibj.command.Command;

public class Close extends Command {
    private Arms arms;

    public Close(Arms arms)
    {
        requires(arms);
        this.arms = arms;
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }
    protected void execute()
    {
        arms.close();
    }
    protected void end()
    {
        arms.stop();
    }
}