package cw_one;

/**
 * This class ....
 *
 * @author Johnathan Yaari
 */

public class OutInstruction extends Instruction {
    private int register;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }

    @Override
    public void execute(Machine m) {
        System.out.println(m.getRegisters().getRegister(register));
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is EDIT OUT toString";
    }
}