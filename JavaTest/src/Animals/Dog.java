/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animals;

/**
 *
 * @author Denis 
 */
public class Dog implements PetInterfase {
    
    private final PetInterfase pet;
    
    public Dog (final PetInterfase pet){
        this.pet = pet;
    }

    @Override
    public void MakeSound() {
 
    }

    @Override
    public String GetName() {
 return this.pet.GetName();
    }
    
}
