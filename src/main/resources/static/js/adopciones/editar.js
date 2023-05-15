$(document).ready(function () {

    $('#adoptado').on('change', function () {

        if ($("#adoptado").prop("checked")) {
          $("#adoptante").css("display", "block");

          //Se agrega atributos required a los inputs
          $('#nombreCompleto').attr('required', 'required');
          $('#telefono').attr('required', 'required');
          $('#email').attr('required', 'required');

        } else {
          $("#adoptante").css("display", "none");

          //Se elimina atributos required a los inputs
          $('#nombreCompleto').removeAttr('required');
          $('#telefono').removeAttr('required');
          $('#email').removeAttr('required');

        }

    });

});