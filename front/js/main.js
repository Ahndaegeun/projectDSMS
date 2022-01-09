// Home
const addZeros = (num, digit) => {
  var zero = ''
  num = num.toString()
  if (num.length < digit) {
    for (i = 0; i < digit - num.length; i++) {
      zero += '0'
    }
  }
  return zero + num
}

const getDayLabel = (num) => {
  const week = new Array('일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일')
  return week[num]
}

setInterval(() => {
  const currentDate = new Date()
  const calendar = (currentDate.getMonth()+1) + ". " + currentDate.getDate()
  const currentHours = addZeros(currentDate.getHours(),2)
  const currentMinute = addZeros(currentDate.getMinutes() ,2)
  const currentDay = currentDate.getDay()

  $('.now-time-wrap .day').html(getDayLabel(currentDay))
  $('.now-time-wrap .month').html(calendar)
  $('.now-time-wrap .time').html(`${currentHours} : ${currentMinute}`)
}, 1000)

// Home
$('.home-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.home-nav button').addClass('clicked')
  $('main > section').addClass('main-view-hidden')
  $('.home-section').removeClass('main-view-hidden')
  $('.student-nav-wrap').addClass('nav-hidden')
})

// Board
$('.board-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.board-nav button').addClass('clicked')
  $('main > section').addClass('main-view-hidden')
  $('.board-section').removeClass('main-view-hidden')
  $('.student-nav-wrap').addClass('nav-hidden')
})

// Student
$('.manage-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.manage-nav > button').addClass('clicked')
  $('.student-nav-wrap').removeClass('nav-hidden')
})

$('.student-info-nav button').on('click', function() {
  $('.student-nav-wrap button').removeClass('clicked')
  $(this).addClass('clicked')
})

$('.student-attend-nav button').on('click', function() {
  $('.student-nav-wrap button').removeClass('clicked')
  $(this).addClass('clicked')
})

$('.student-cons-nav button').on('click', function() {
  $('.student-nav-wrap button').removeClass('clicked')
  $(this).addClass('clicked')
})

$('.schedule-nav button').on('click', function() {
  $('.student-nav-wrap button').removeClass('clicked')
  $(this).addClass('clicked')
})

// Admin
// $().on('click', function() {
  
// })

// Map
$('.employ-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.employ-nav button').addClass('clicked')
  $('main > section').addClass('main-view-hidden')
  $('.employ-section').removeClass('main-view-hidden')
  $('.student-nav-wrap').addClass('nav-hidden')
})


// Chat
$('.chat-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.chat-nav button').addClass('clicked')
  $('main > section').addClass('main-view-hidden')
  $('.chat-section').removeClass('main-view-hidden')
  $('.student-nav-wrap').addClass('nav-hidden')
})


// My Page
$('.my-nav button').on('click', function() {
  $('nav ul li > button').removeClass('clicked')
  $('.my-nav button').addClass('clicked')
  $('main > section').addClass('main-view-hidden')
  $('.my-section').removeClass('main-view-hidden')
  $('.student-nav-wrap').addClass('nav-hidden')
})

