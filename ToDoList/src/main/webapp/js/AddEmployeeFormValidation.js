$(function() {
    $.validator.addMethod("validPhoneNumber",function(value,element){    	
        if(value.length==10){
            return true;
        }
        return false;
    },'Invalid Phone Number.');        
    
    $("#addEmpForm").validate({
        rules:{
            empName:"required",
            empEmail:{
                required: true,
                email: true
            },
            empContact:{
                required:true,
                validPhoneNumber:true		
            },
            empAddress:"required"
        },
        messages:{					
            empEmail:{
                required:'Please Enter E-mail address.',
                email:'Please Enter Valid e-mail address.'
            }				
        }				
    });			
    
});