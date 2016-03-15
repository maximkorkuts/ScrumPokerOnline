(function($){
  $(function(){

    $('.parallax').parallax();
    $('ul.tabs').tabs('select_tab', 'tab_id');
  }); // end of document ready
})(jQuery); // end of jQuery name space


$('.modal-trigger').leanModal({
      dismissible: true, // Modal can be dismissed by clicking outside of the modal
      opacity: .5, // Opacity of modal background
      in_duration: 300, // Transition in duration
      out_duration: 200, // Transition out duration
      ready: function() { console.log('Ready'); }, // Callback for Modal open
      complete: function() { console.log('Closed'); } // Callback for Modal close
    }
);