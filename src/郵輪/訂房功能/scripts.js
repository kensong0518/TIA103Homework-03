// 模擬從資料庫獲取房間狀態的函數
function getRoomStatus() {
    // 模擬的房間狀態，假設從資料庫獲取
    return {
        presidential: Array(10).fill(true), // 所有房間可用
        deluxe: Array(10).fill(true),
        single: Array(10).fill(true)
    };
}

// 模擬顧客選擇的房間
let selectedRooms = [];
let roomStatus = getRoomStatus(); // 全局房間狀態

// 更新顧客選擇的房間列表
function updateSelectedRooms() {
    const selectedRoomsList = document.getElementById('selected-rooms');
    selectedRoomsList.innerHTML = ''; // 清空顧客選擇的房間列表

    selectedRooms.forEach(room => {
        const li = document.createElement('li');
        li.innerHTML = `
            ${room}
            <div class="room-controls">
                <button onclick="deleteRoom('${room}')">刪除</button>
            </div>
        `;
        selectedRoomsList.appendChild(li);
    });
}

// 根據房型填充房間
function populateRooms(roomType, roomNumbers) {
    const roomList = document.getElementById(`${roomType}-rooms`);
    roomList.innerHTML = '';  // 清空房間列表

    roomNumbers.forEach(roomNumber => {
        if (roomStatus[roomType][roomNumber - 1]) {  // 檢查房間是否可用
            const li = document.createElement('li');
            li.innerHTML = `
                Room ${roomNumber}
                <div class="room-controls">
                    <button onclick="addRoom('${roomType}', ${roomNumber})">新增</button>
                </div>
            `;
            roomList.appendChild(li);
        }
    });
}

// 新增房間到顧客選擇的清單
function addRoom(roomType, roomNumber) {
    const roomString = `Room ${roomNumber} (${roomType})`;
    if (!selectedRooms.includes(roomString)) {
        selectedRooms.push(roomString);
        roomStatus[roomType][roomNumber - 1] = false;  // 標記房間為不可用
        updateSelectedRooms(); // 更新顧客選擇的房間列表
        loadRoomStatus();  // 重新加載房間狀態
    }
}

// 從顧客選擇的清單中刪除房間
function deleteRoom(roomString) {
    selectedRooms = selectedRooms.filter(room => room !== roomString);

    // 提取房型和房號
    const [_, roomNumber, roomType] = roomString.match(/Room (\d+) \((\w+)\)/);
    roomStatus[roomType.toLowerCase()][roomNumber - 1] = true; // 標記房間為可用

    updateSelectedRooms(); // 更新顧客選擇的房間列表
    loadRoomStatus();  // 重新加載房間狀態
}

// 確認選擇並提交的邏輯
function confirmSelection() {
    // 確認選擇並提交的邏輯
    alert('您的房間選擇已確認。');
}

// 加載房間狀態
function loadRoomStatus() {
    // 房間號碼設置
    populateRooms('presidential', Array.from({ length: 10 }, (_, i) => i + 1));
    populateRooms('deluxe', Array.from({ length: 10 }, (_, i) => i + 1));
    populateRooms('single', Array.from({ length: 10 }, (_, i) => i + 1));
}

// 頁面加載時顯示所有房間
document.addEventListener('DOMContentLoaded', function() {
    loadRoomStatus();
});
